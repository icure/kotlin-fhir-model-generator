//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.endpoint

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The technical details of an endpoint that can be used for electronic services
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web
 * services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This
 * may include any security context information.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | suspended | error | off | entered-in-error | test
 * @param name A name that this endpoint can be identified by
 * @param description Additional details about the endpoint that could be displayed as further
 * information to identify the description beyond its name
 * @param managingOrganization Organization that manages this endpoint (might not be the
 * organization that exposes the endpoint)
 * @param period Interval the endpoint is expected to be operational
 * @param address The technical base address for connecting to this endpoint
 */
@SerialName("Endpoint")
@Serializable
public data class Endpoint(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * active | suspended | error | off | entered-in-error | test
   */
  public val status: String? = null,
  public val connectionType: List<CodeableConcept> = emptyList(),
  /**
   * A name that this endpoint can be identified by
   */
  public val name: String? = null,
  /**
   * Additional details about the endpoint that could be displayed as further information to
   * identify the description beyond its name
   */
  public val description: String? = null,
  public val environmentType: List<CodeableConcept> = emptyList(),
  /**
   * Organization that manages this endpoint (might not be the organization that exposes the
   * endpoint)
   */
  public val managingOrganization: Reference? = null,
  public val contact: List<ContactPoint> = emptyList(),
  /**
   * Interval the endpoint is expected to be operational
   */
  public val period: Period? = null,
  public val payload: List<EndpointPayload> = emptyList(),
  /**
   * The technical base address for connecting to this endpoint
   */
  public val address: String? = null,
  public val `header`: List<String> = emptyList(),
) : DomainResource

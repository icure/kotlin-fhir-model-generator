//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.endpoint

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The technical details of an endpoint that can be used for electronic services
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web
 * services providing XDS.b or a REST endpoint for another FHIR server. This may include any security
 * context information.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | suspended | error | off | entered-in-error | test
 * @param connectionType Protocol/Profile/Standard to be used with this endpoint connection
 * @param name A name that this endpoint can be identified by
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
  /**
   * Protocol/Profile/Standard to be used with this endpoint connection
   */
  public val connectionType: Coding,
  /**
   * A name that this endpoint can be identified by
   */
  public val name: String? = null,
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
  public val payloadType: List<CodeableConcept> = emptyList(),
  public val payloadMimeType: List<String> = emptyList(),
  /**
   * The technical base address for connecting to this endpoint
   */
  public val address: String? = null,
  public val `header`: List<String> = emptyList(),
) : DomainResource

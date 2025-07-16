//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.location

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.address.Address
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details and position information for a physical place
 *
 * Details and position information for a physical place where services are provided and resources
 * and participants may be stored, found, contained, or accommodated.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | suspended | inactive
 * @param operationalStatus The operational status of the location (typically only for a bed/room)
 * @param name Name of the location as used by humans
 * @param description Additional details about the location that could be displayed as further
 * information to identify the location beyond its name
 * @param mode instance | kind
 * @param address Physical location
 * @param physicalType Physical form of the location
 * @param position The absolute geographic location
 * @param managingOrganization Organization responsible for provisioning and upkeep
 * @param partOf Another Location this one is physically a part of
 * @param availabilityExceptions Description of availability exceptions
 */
@SerialName("Location")
@Serializable
public data class Location(
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
   * active | suspended | inactive
   */
  public val status: String? = null,
  /**
   * The operational status of the location (typically only for a bed/room)
   */
  public val operationalStatus: Coding? = null,
  /**
   * Name of the location as used by humans
   */
  public val name: String? = null,
  public val alias: List<String> = emptyList(),
  /**
   * Additional details about the location that could be displayed as further information to
   * identify the location beyond its name
   */
  public val description: String? = null,
  /**
   * instance | kind
   */
  public val mode: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * Physical location
   */
  public val address: Address? = null,
  /**
   * Physical form of the location
   */
  public val physicalType: CodeableConcept? = null,
  /**
   * The absolute geographic location
   */
  public val position: LocationPosition? = null,
  /**
   * Organization responsible for provisioning and upkeep
   */
  public val managingOrganization: Reference? = null,
  /**
   * Another Location this one is physically a part of
   */
  public val partOf: Reference? = null,
  public val hoursOfOperation: List<LocationHoursOfOperation> = emptyList(),
  /**
   * Description of availability exceptions
   */
  public val availabilityExceptions: String? = null,
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
